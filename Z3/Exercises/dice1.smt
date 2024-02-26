; appearing letters: C, A, T, S, O, N, P, D, R, I, G, E
(declare-const C Bool)
(declare-const A Bool)
(declare-const T Bool)
(declare-const S Bool)
(declare-const O Bool)
(declare-const N Bool)
(declare-const P Bool)
(declare-const D Bool)
(declare-const R Bool)
(declare-const I Bool)
(declare-const G Bool)
(declare-const E Bool)

; only 1 letter of each word can be placed on a dice
(define-fun dice ((Letter1 Bool) (Letter2 Bool) (Letter3 Bool)) Bool
   (or 
      (and Letter1 (not Letter2) (not Letter3))
      (and Letter2 (not Letter1) (not Letter3))
      (and Letter3 (not Letter1) (not Letter2))
   )
)


; Assert the words
(assert (placeLetters C A T))
(assert (placeLetters S O N))
(assert (placeLetters P O D))
(assert (placeLetters R I G))
(assert (placeLetters P E G))
(assert (placeLetters T A P))
(assert (placeLetters D I N))
(assert (placeLetters A P E))


(check-sat)

(echo "dice1 contains the following letters: ")
(get-value ())
(echo "dice2 contains the following letters: ")
(get-value ())
(echo "dice3 contains the following letters: ")
(get-value ())
(echo "dice4 contains the following letters: ")
(get-value ())
