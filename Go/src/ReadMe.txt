This is a program simulating the classic game of Go
Upon launching, the program will draw the 19x19 board (edges included)
Clicking the intersection between two lines will draw the appropriate stone for the player of a given round

Black plays first

Rules:
1)Liberties
    -any empty space adjacent to a stone is a liberty, when a stone has no liberties, it is considered captured
    and should be removed from the board
    -However a group of stones has its own liberties and is treated as a single object
    for instance: if two white stones are horizontally adjacent, the group has six liberties (assuming that there are
    no stones in any of the further adjacent intersections
2)Captures
    -When a stone has no liberties, press the red button at the top to initiate removal of captured stones
   -to exit removal mode, press the red button again
3)Game End
    -The game ends when both players have passed on their turns
    - to pass, double click any empty space
