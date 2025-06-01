# output

PS D:\AP\Academic-prep\Automata\New\Week 4\3.1.2> cd "d:\AP\Academic-prep\Automata\New\Week 4\3.1.2" && java -jar lib/antlr-4.13.2-complete.jar -visitor MyGrammar.g4 && javac -cp ".;lib/_" _.java && java -cp ".;lib/\*" Main
Testing the language {a^n b^m : (n + m) is odd}

---

Examples of strings in the language:
a (1 characters)
abb (3 characters)
abbbb (5 characters)
aaa (3 characters)
aaabb (5 characters)
aaabbbb (7 characters)
aaaaa (5 characters)
aaaaabb (7 characters)
aaaaabbbb (9 characters)
b (1 characters)

Validating that the grammar accepts these strings:
a: Valid
abb: Valid
abbbb: Valid
aaa: Valid
aaabb: Valid
aaabbbb: Valid
aaaaa: Valid
aaaaabb: Valid
aaaaabbbb: Valid
b: Valid

Validating that the grammar rejects invalid strings:
aa: Invalid
aabb: Invalid
aaabbb: Invalid
abab: Invalid
ba: Invalid
: Invalid

Regular expression for this language:
a(aa)_(bb)_ + (aa)_b(bb)_
Which means:

- An odd number of a's followed by an even number of b's, OR
- An even number of a's followed by an odd number of b's
