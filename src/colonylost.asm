#import "_segments.asm"

.file [name="./colonylost.prg", segments="Code", modify="BasicUpstart", _start=$0810]
.segment Code

start:
    jmp start
