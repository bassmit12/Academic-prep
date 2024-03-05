(declare-const C Int)
(declare-const A Int)
(declare-const T Int)
(declare-const S Int)
(declare-const O Int)
(declare-const N Int)
(declare-const P Int)
(declare-const D Int)
(declare-const R Int)
(declare-const I Int)
(declare-const G Int)
(declare-const E Int)
 
(assert (and
 
(distinct C A T)
(distinct S O N)
(distinct P O D)
(distinct R I G)
(distinct P E G)
(distinct T A P)
(distinct D I N)
(distinct A P E)
 
(<= 1 C 3) ; every symbol gets a value that is the number of the dice on which it appears
	; so all values must be 1,2, or 3
(<= 1 A 3)
(<= 1 T 3)
(<= 1 S 3)
(<= 1 O 3)
(<= 1 N 3)
(<= 1 P 3)
(<= 1 D 3)
(<= 1 R 3)
(<= 1 I 3)
(<= 1 G 3)
(<= 1 E 3)
 
))
 
(check-sat)
(get-value (
 
C A T;
S O N;
P O D;
R I G;
P E G;
T A P;
D I N;
A P E
 
))