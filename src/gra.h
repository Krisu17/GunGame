#ifndef _GRA_H_
#define _GRA_H_
#define board_size 20

typedef enum
{
    false,
    true
} bool;

typedef struct
{
    char *column;
} * playboard;

void play(playboard main_board, playboard secondary_board, int generations, bool sbs);

void make_generation(playboard main_board, playboard secondary_board);

int neighbours(playboard board, int row, int column);

void print_to_screen(playboard board);

void export_png(playboard board);

void export_txt(playboard board);

bool check_filename(char *file_name);

void swap_ptr(playboard *main_board, playboard *secondary_board);

#endif
