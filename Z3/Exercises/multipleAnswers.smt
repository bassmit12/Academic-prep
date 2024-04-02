
; Declare a real variable x
(declare-fun x () Real)

; Assert the quadratic equation
(assert (= (+ (* x x) (* 115 x) 3066) 0))

; Find the first root
(check-sat)
(get-value (x))

; Assuming the first root found was x = -42, we now exclude this solution
(assert (not (= x -42)))

; Find the second root
(check-sat)
(get-value (x))