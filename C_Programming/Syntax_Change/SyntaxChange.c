#include <stdio.h>

#define SEMI_COLON ;
#define OPEN_BRACKET {
#define CLOSE_BRACKET }
#define INTEGER int
#define YUCKS main
#define GO_BACK return
#define SHOW printf

/*
    This program shows off the customisability of C Programming and just
    because you could doesn't mean you should :)
*/
INTEGER YUCKS()
    OPEN_BRACKET

    SHOW("Hello World\n")SEMI_COLON
GO_BACK 0 SEMI_COLON
CLOSE_BRACKET