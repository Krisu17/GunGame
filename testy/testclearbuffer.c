#include "../src/gra.h"
#include <stdio.h>
#include <stdlib.h>
#include <string.h>
#include <ctype.h>

void print_to_screen(playboard board)
{

    for (int i = 0; i < board_size + 2; i++)
    {
        for (int j = 0; j < board_size + 2; j++)
        {
            if ((board[i].column[j]) == '0')
            {
                printf("0 ");
            }
            else
            {
                printf("1 ");
            }
        }
        printf("\n");
    }
}

void clear_buffer(playboard main_board)
{
    for (int i = 1; i < board_size + 1; i++)
    {
        main_board[i].column[0] = '0';
        main_board[i].column[board_size + 1] = '0';
    }
    for (int i = 0; i < board_size + 2; i++)
    {
        main_board[0].column[i] = '0';
        main_board[board_size + 1].column[i] = '0';
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
            if (c == EOF)
            {
                printf("Podany plik jest zbyt krotki. Musi posiadac dane do tabeli o wymiarach %d x %d czyli %d elementow.\n", board_size, board_size, board_size * board_size);
                return 100;
            }
            while (isspace(c))
            {
                c = fgetc(data);
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

int main(int argc, char *argv[])
{
    FILE *input = fopen(argv[1], "r");
    if (input == NULL)
    {
        printf("Plik wejeciowy %s nie istnieje lub podczas otwierania wystapil blad.\n", argv[1]);
        return 2;
    }

    playboard main_board = malloc((board_size + 2) * sizeof *main_board);
    for (int i = 0; i < board_size + 2; i++)
    {
        main_board[i].column = malloc((board_size + 2) * sizeof(char));
    }

    clear_buffer(main_board);
    read_board(main_board, input);
    print_to_screen(main_board);
    for (int i = 0; i < board_size + 2; i++)
    {
        free(main_board[i].column);
    }
    free(main_board);
    fclose(input);
    return 0;
}