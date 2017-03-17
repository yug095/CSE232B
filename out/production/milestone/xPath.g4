grammar xPath;

ap          :    DOC '(' StringConstant ')''/'rp                     # apsl
            |    DOC '(' StringConstant ')''//'rp                    # apslsl
            ;

rp          :    NAME                                                # tagName
            |    '*'                                                 # star
            |    '.'                                                 # dot
            |    '..'                                                # parent
            |    TEXT                                                # text
            |    '@' NAME                                            # attribute
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
            |    joinClause                                          # joinXQ
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

joinClause  :    'join' '(' xq ',' xq ','  varList ',' varList ')'
            ;

varList     :    '[' NAME (',' NAME)* ']'
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

subxq       :    'for' var 'in' path (',' var 'in' path)* 'where' subcond 'return' subreturn
            ;

//we first only allow var eq stringConstant and var eq var
subcond     :    var 'eq' var                                       # varEq1SubCond
            |    var '='  var                                       # varEq2SubCond
            |    var '='  StringConstant                            # varStrEq1SubCond
            |    var 'eq' StringConstant                            # varStrEq2SubCond
            |    subcond 'and' subcond                              # andSubCond
            ;

subreturn   :    var                                                # varSubReturn
            |    subreturn ',' subreturn                            # commaSubReturn
            |    '<' NAME '>' '{' subreturn '}' '<''/'NAME'>'       # tagSubReturn
            |    path                                               # xqSubReturn
            ;

path        :  DOC '(' StringConstant ')'(sep NAME)*               # rootnodePath
            |  DOC '(' StringConstant ')' (sep NAME)* sep TEXT     # roottextPath
            |  var  (sep NAME)*                                    # varnodePath
            |  var  (sep NAME)* sep TEXT                           # vartextPath
            ;

sep         :  '/'
            |  '//'
            ;
NAME        :    [a-zA-Z0-9._]+ ;
TEXT        :    'text()'  ;
WS          :    [ \t\r\n]+ -> skip;
StringConstant: '"'+[a-zA-Z0-9,.!?; _''""-]+'"';