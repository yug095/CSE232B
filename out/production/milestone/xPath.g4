grammar xPath;

ap          :    DOC '(' StringConstant ')''/'rp                     # apsl
            |    DOC '(' StringConstant ')''//'rp                    # apslsl
            ;

rp          :    NAME                                                # tagName
            |    STAR                                                # star
            |    DOT                                                 # dot
            |    PARENT                                              # parent
            |    TEXT                                                # text
            |    AT NAME                                             # attribute
            |    '(' rp ')'                                          # parens
            |    rp '/' rp                                           # singleSlashRp
            |    rp '//' rp                                          # doubleSlashRp
            |    rp '[' filter ']'                                   # filterRp
            |    rp ',' rp                                           # commaRp
            ;

filter      :    rp                                                  # rpFilter
            |    rp '=' rp                                           # eq1Filter
            |    rp 'eq' rp                                          # eq2Filter
            |    rp '==' rp                                          # is1Filter
            |    rp 'is' rp                                          # is2Filter
            |    '(' filter ')'                                      # parensFilter
            |    filter 'and' filter                                 # andFilter
            |    filter 'or' filter                                  # orFilter
            |    'not' filter                                        # notFilter
            ;


xq          :    var                                                 # varXQ
            |    StringConstant                                      # scXQ
            |    ap                                                  # apXQ
            |    '(' xq ')'                                          # parensXQ
            |    xq ',' xq                                           # commaXQ
            |    xq '/' rp                                           # singleSlashXQ
            |    xq '//' rp                                          # doubleSlashXQ
            |    '<' NAME '>' '{' xq '}' '<''/'NAME'>'               # tagNameXQ
            |    forClause letClause? whereClause? returnClause      # flwrXQ
            |    letClause xq                                        # letXQ
            ;

var         :    '$' NAME
            ;

forClause   :    'for' var 'in' xq (',' var 'in' xq)*
            ;

letClause   :    'let' var ':=' xq (',' var ':=' xq)*
            ;

whereClause :    'where' cond
            ;

returnClause:    'return' xq
            ;

cond        :    xq '=' xq                                           # eq1Cond
            |    xq 'eq' xq                                          # eq2Cond
            |    xq '==' xq                                          # is1Cond
            |    xq 'is' xq                                          # is2Cond
            |    'empty' '(' xq ')'                                  # emptyCond
            |    'some' var 'in' xq (var 'in' xq)* 'satisfies' cond  # someSatisCond
            |    '(' cond ')'                                        # parensCond
            |    cond 'and' cond                                     # andCond
            |    cond 'or'  cond                                     # orCond
            |    'not' cond                                          # notCond
            ;


DOC         :    'doc'
            |    'document'
            ;
NAME        :    [a-zA-Z0-9._]+ ;
STAR        :    '*'       ;
DOT         :    '.'       ;
PARENT      :    '..'      ;
TEXT        :    'text()'  ;
AT          :    '@'       ;
WS          :    [ \t\r\n]+ -> skip;
StringConstant: '"'+[a-zA-Z0-9,.!?; _''""-]+'"';