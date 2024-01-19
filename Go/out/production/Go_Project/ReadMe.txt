This is a program simulating the classic game of Go
Upon launching, the program will draw the 19x19 board (edges included)
Clicking the intersection between two lines will draw the appropriate stone for the player of a given round

Black plays first

Rules:
1)Liberties
    -any empty space adjacent to a stone is a liberty, when a stone has no liberties, it is considered captured
    and should be removed from the board
    -However a group of stones has it's own liberties and is treated as a single objects
    for instance: if two white stones are horizontally adjacent, the group has six liberties (assuming that there are
    no stones in any of the further adjacent intersections
2)Captures
    -While ideally the program would register all captures automatically, manual removal is currently the method
    by which stones will be removed (which is standard in the physical game)
    -Captures will occur with a command of rmv, which will change the cursor color to red, removed stones will add one to
    the opposite color's score
    -play command will exit remove mode
3)Game End
    -The game ends when both players have passed on their turns
    -entering the command pass will end a player's turn
