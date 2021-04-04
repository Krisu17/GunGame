#include "gra.h"
#include <stdio.h>
#include <stdlib.h>
#include <string.h>
#include <ctype.h>

void clear_buffer(playboard main_board, playboard secondary_board)
{
    for (int i = 1; i < board_size + 1; i++)
    {
        main_board[i].column[0] = '0';
        main_board[i].column[board_size + 1] = '0';
        secondary_board[i].column[0] = '0';
        secondary_board[i].column[board_size + 1] = '0';
    }
    for (int i = 0; i < board_size + 2; i++)
    {
        main_board[0].column[i] = '0';
        main_board[board_size + 1].column[i] = '0';
        secondary_board[0].column[i] = '0';
        secondary_board[board_size + 1].column[i] = '0';
    }
}

int read_board(playboard main_board, FILE *data)
{
    char c;
    for (int i = 1; i < board_size + 1; i++)
    {
        for (int j = 1; j < board_size + 1; j++)
        {
            c = fgetc(data);
            
            while (isspace(c))
            {
                c = fgetc(data);
            }
            if (c == EOF)
            {
                printf("Podany plik jest zbyt krotki. Musi posiadac dane do tabeli o wymiarach %d x %d czyli %d elementow.\n", board_size, board_size, board_size * board_size);
                return 100;
            }
            if (c != '0' && c != '1')
            {
                printf("W pliku znajduja sie inne znaki poza 0 i 1. Prosze podac poprawny plik.\n");
                return 101;
            }
            else
            {
                main_board[i].column[j] = c;
            }
        }
    }
    c = fgetc(data);
    if ((fgetc(data)) != EOF)
    {
        c = fgetc(data);
        while (c == '\n')
        {
            c = fgetc(data);
        }
        if ((fgetc(data)) != EOF)
        {
            printf("Podany plik jest zbyt dlugi. Musi posiadac dane do tabeli o wymiarach %d x %d czyli %d elementow.\n", board_size, board_size, board_size * board_size);
            return 102;
        }
    }
    return 0;
}

bool is_number(char number[])
{
    int n = strlen(number);
    for (int i = 0; i < n; i++)
    {
        if (isdigit(number[i]) == 0)
        {
            return false;
        }
    }
    return true;
}

int main(int argc, char *argv[])
{
    if (argc > 4) 
    {
        printf("\nZostalo podanych za duzo argumentow. Prosze podac co najwyzej 4 agrumenty. \n\n ");
        return -1;
    }
    if (argc < 3)
    {
        printf("\nZostalo podanych za malo argumentow. Prosze podac co najmniej 3 argumenty.\n\n");
        return 1;
    }
    FILE *input = fopen(argv[1], "r");
    if (input == NULL)
    {
        printf("\nPlik wejeciowy %s nie istnieje lub podczas otwierania wystapil blad.\n\n", argv[1]);
        return 2;
    }
    int generation_number = atoi(argv[2]);
    if (is_number(argv[2]))
    {
        if (generation_number < 1 || generation_number > 100)
        {
            printf("\nPodana liczba generacji nie miesci sie w dostepnym przedziale. Podaj liczbe od 0 do 100.\n\n");
            return 3;
        }
    }
    else
    {
        printf("\nDrugi argument nie jest poprawna liczba. Podaj liczbę z zakresu od 1 do 100.\n\n");
        return 3;
    }

    bool sbs = false;
    if (argc == 4)
    {
        if (strcmp(argv[3], "-sbs") == 0)
        {
            sbs = true;
        }
        else
        {
            printf("\nPodana flaga %s jest niepoprawna, dostepne jest tylko podanie flagi -sbs.\n\n", argv[3]);
            return 5;
        }
    }

    printf("\n\n");

    playboard main_board = malloc((board_size + 2) * sizeof *main_board);
    playboard secondary_board = malloc((board_size + 2) * sizeof *main_board);
    if (main_board == NULL || secondary_board == NULL)
    {
        printf("\nBlad podczas alokacji pamieci. Prawdopodobna przyczyna: brak wolnej pamieci na komputerze lub stala board_size w pliku gra.h ustawiona jest na 0. Program nie jest wstanie wykonac zadanej operacji.\n\n");
	return -2;
    }
    for (int i = 0; i < board_size + 2; i++)
    {
        main_board[i].column = malloc((board_size + 2) * sizeof(char));
        secondary_board[i].column = malloc((board_size + 2) * sizeof(char));
    }

    clear_buffer(main_board, secondary_board);
    if (read_board(main_board, input) != 0)
    {
        return 6;
    }

    play(main_board, secondary_board, generation_number, sbs);

    for (int i = 0; i < board_size + 2; i++)
    {
        free(secondary_board[i].column);
        free(main_board[i].column);
    }
    free(secondary_board);
    free(main_board);
    fclose(input);
    printf("Program zakonczyl swoje dzialanie. Dziekujemy za uzywanie i zapraszamy ponownie.\n\n\n\n");
    return 0;
}
