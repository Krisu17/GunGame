#include "png.h"
#include "gra.h"
#include <stdio.h>
#include <stdlib.h>
#include <string.h>

void play(playboard main_board, playboard secondary_board, int generations, bool sbs)
{
    int played_games = 0;
    char answer;
    int loop = 0;
    for (int it = 0; it < generations; it++)
    {
        if (played_games == generations - 1)
        {
            sbs = true;
        }
        make_generation(main_board, secondary_board);
        swap_ptr(&main_board, &secondary_board);
        played_games++;
        printf("Generacja %d:\n", played_games);
        print_to_screen(main_board);
        loop = 0;
        if (sbs == true)
        {
            while (loop == 0)
            {
                printf("\nAby przejsc dalej wcisnij n\n");
                printf("Aby stworzyc obraz z obecnej generacji wcisnij p\n");
                printf("Aby wyeksportowac do pliku tekstowego wcisnij  t \n");
                printf("Aby zakonczyc wcisnij q\n\n");
            input:
                system("/bin/stty raw");
                answer = getchar();
                system("/bin/stty cooked");
                fflush(stdin);
                printf("\n");
                switch (answer)
                {
                case 'n':
                    printf("Wybrales opcje: %c\n\n", answer);
                    loop = 1;
                    break;
                case 'p':
                    printf("Wybrales opcje: %c\n\n", answer);
                    export_png(main_board);
                    break;
                case 't':
                    printf("Wybrales opcje: %c\n\n", answer);
                    export_txt(main_board);
                    break;
                case 'q':
                    printf("Wybrales opcje: %c\n\n", answer);
                    return;
                    break;
                case '\n':
                    goto input;
                    break;
                default:
                    printf("Wybrana opcja: %c, jest niepoprawna, akceptowane sa tylko polecenia \nn \np \nt\nq\n\n Wprowadz ponownie.\n\n\n", answer);
                    break;
                }
            }
        }
    }
}

void make_generation(playboard main_board, playboard secondary_board)
{
    int mower = 0;
    for (int i = 1; i < board_size + 1; i++)
    {
        for (int j = 1; j < board_size + 1; j++)
        {
            if (main_board[i].column[j] == '1')
            {
                mower = neighbours(main_board, i, j);
                if (mower == 2 || mower == 3)
                {
                    secondary_board[i].column[j] = '1';
                }
                else
                {
                    secondary_board[i].column[j] = '0';
                }
            }
            if (main_board[i].column[j] == '0')
            {
                mower = neighbours(main_board, i, j);
                if (mower == 3)
                {
                    secondary_board[i].column[j] = '1';
                }
                else
                {
                    secondary_board[i].column[j] = '0';
                }
            }
        }
    }
}

int neighbours(playboard board, int row, int column)
{
    int score = 0;
    if (board[row - 1].column[column - 1] == '1')
    {
        score++;
    }
    if (board[row - 1].column[column] == '1')
    {
        score++;
    }
    if (board[row - 1].column[column + 1] == '1')
    {
        score++;
    }
    if (board[row].column[column - 1] == '1')
    {
        score++;
    }
    if (board[row].column[column + 1] == '1')
    {
        score++;
    }
    if (board[row + 1].column[column - 1] == '1')
    {
        score++;
    }
    if (board[row + 1].column[column] == '1')
    {
        score++;
    }
    if (board[row + 1].column[column + 1] == '1')
    {
        score++;
    }

    return score;
}

void print_to_screen(playboard board)
{
    for (int t = 0; t < board_size * 2 + 2; t++)
    {
        printf("#");
    }
    printf("\n");
    for (int i = 1; i < board_size + 1; i++)
    {
        printf("#");
        for (int j = 1; j < board_size + 1; j++)
        {
            if ((board[i].column[j]) == '0')
            {
                printf("  ");
            }
            else
            {
                printf("%c%c", 255, 255);
            }
        }
        printf("#\n");
    }
    for (int t = 0; t < board_size * 2 + 2; t++)
    {
        printf("#");
    }
    printf("\n");
}

void export_png(playboard board)
{
    printf("Proszę podaj nazwę obrazu.\n");
    char file_name[255];
    system("/bin/stty cooked");
    scanf("%s", file_name);
    fflush(stdin);
    if (check_filename(file_name) == true)
    {
        char destination[8] = "wyniki/";
        char type[5] = ".png";
        strcat(destination, file_name);
        strcat(destination, type);
        png(board, destination);
    }
    else
    {
        export_png(board);
    }
}

void export_txt(playboard board)
{
    printf("Prosze podac nazwe pliku tekstowego\n");
    char file_name[255] = {'\0'};
    scanf("%s", file_name);
    printf("\n");
    if (check_filename(file_name) == true)
    {
        char destination[8] = "wyniki/";
        char type[5] = ".txt";
        strcat(destination, file_name);
        strcat(destination, type);
        FILE *output = fopen(destination, "w");
        for (int i = 1; i < board_size + 1; i++)
        {
            for (int j = 1; j < board_size + 1; j++)
            {
                fprintf(output, "%c ", board[i].column[j]);
            }
            fprintf(output, "\n");
        }
        fclose(output);
    }
    else
    {
        export_txt(board);
    }
}

bool check_filename(char *file_name)
{
    char *forbidden = "˜¨#%&*:<>?/\\{|}.";
    char *ptr = strpbrk(file_name, forbidden);
    if (ptr != NULL)
    {
        printf("Nazwa pliku zawiera znak zabroniony: %c.\n Proszę podać poprawną nazwę pliku.\n", *ptr);
        return false;
    }
    else
    {
        return true;
    }
}

void swap_ptr(playboard *main_board, playboard *secondary_board)
{
    playboard temp = *main_board;
    *main_board = *secondary_board;
    *secondary_board = temp;
}
