# output

D:\AP\Academic-prep\Automata\New\Week 4\3.2.7>run
DFA for: L(ab*a*)
States: 4
q0
a -> q1
q3 (accepting)
a -> q3
q2 (accepting)
a -> q3
b -> q2
q1 (accepting)
a -> q3
b -> q2
Start state: q0
Accepting states: 3
q3
q2
q1

DFA for: L((b)\*ab)
States: 3
p2 (accepting)
p0
a -> p1
b -> p0
p1
b -> p2
Start state: p0
Accepting states: 1
p2

DFA for: L(ab*a*) ∩ L((b)\*ab)
States: 3
(q1,p1)
b -> (q2,p2)
(q0,p0)
a -> (q1,p1)
(q2,p2) (accepting)
Start state: (q0,p0)
Accepting states: 1
(q2,p2)

## Analysis of the Intersection Language L = L(ab*a*) ∩ L((b)\*ab):

1. The language consists of strings that:

   - Start with 'a'
   - End with 'b'
   - Have the pattern 'ab' somewhere in the string

2. The simplest string in this language is: "ab"

3. Other examples of strings in the language:

   - "abb" (matches ab*a* and b\*ab)
   - "abab" (matches ab*a* and b\*ab)
   - "aabb" (matches ab*a* and b\*ab)

4. Formal description:
   The language can be described as: L = {ab(b|a)\*b | n ≥ 0}
   This represents strings that start with 'a', end with 'b',
   and have at least one 'b' after the initial 'a'.

Testing some strings against the intersection DFA:
"ab" - Accepted
"a" - Rejected
"b" - Rejected
"abb" - Rejected (Unexpected!)
"abab" - Rejected (Unexpected!)
"aba" - Rejected
"bab" - Rejected
"aabb" - Rejected (Unexpected!)

D:\AP\Academic-prep\Automata\New\Week 4\3.2.7>
