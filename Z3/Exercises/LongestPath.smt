; Eight points are positioned in a circle at regular distances from eachother. We'll walk along
; the points, walking from one point to another, in such a way that:
; we never walk across the same point pair more than once, in either direction
; we never walk from a point to one of its two direct neighbouring points

(declare-fun point (Int) Int)

; start cannot be end and start + 1 or start -1 
(define-fun isNotNeighbor ((start Int) (end Int)) Bool
     (not (or (= end (mod (+ start 1) 8)) (= end (mod (- start 1) 8)) (= start end))))

; all values must be between 1 and 8
(assert 
    (forall ((i Int)) 
        (implies 
            (and 
                (>= i 1) 
                (<= i 8)
            ) 
            (and 
                (>= (point i) 1) 
                (<= (point i) 8)
            )
        )
    )
)

; for each value of 1 between 1 and 8 make sure the outcome is not Neighbor
(assert     
    (forall ((i Int))
        (implies
            (and
                (>= i 1) 
                (<= i 8)
            )
            (isNotNeighbor i (point i))
        )
    )
)


; Ensure every point and it's next visited point is unqique
(assert (distinct (point 1) (point 2) (point 3) (point 4) (point 5) (point 6) (point 7) (point 8)))



(check-sat)
(get-value 
    (
        (point 1) (point 2) (point 3) (point 4) (point 5) (point 6) (point 7) (point 8)
    )
)

