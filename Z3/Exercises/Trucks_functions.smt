; accepts a truck and returns the amount
(declare-fun nuzzles (Int) Int)
(declare-fun prittles (Int) Int)
(declare-fun skipples (Int) Int)
(declare-fun crottles (Int) Int)
(declare-fun dupples (Int) Int)

(define-fun weightLimit ((nuzzlesAmount Int)(prittlesAmount Int)(skipplesAmount Int)(crottlesAmount Int)(dupplesAmount Int)) Bool
    (forall ((x Int))
        (implies
            (>= 1 x 6)
            (and
                (<= 8000
                    (+
                        (* 800 (nuzzles x))
                        (* 1300 (prittles x))
                        (* 1000 (skipples x))
                        (* 1500 (crottles x))
                        (* 400 (dupples x))
                    )
                )
            )
        )
    )
)

(define-fun maxPallets ((nuzzlesAmount Int)(prittlesAmount Int)(skipplesAmount Int)(crottlesAmount Int)(dupplesAmount Int)) Bool
    (forall ((x Int))
        (implies
            (>= 1 x 6)
            (and
                (<= 8
                    (+
                        (nuzzles x)
                        (prittles x)
                        (skipples x)
                        (crottles x)
                        (dupples x)
                    )
                )
            )
        )
    )
)


(assert (and
    ; there are a given amount of nuzzles etc...
    (= 4
        (+
            (nuzzles 1)
            (nuzzles 2)
            (nuzzles 3)
            (nuzzles 4)
            (nuzzles 5)
            (nuzzles 6)
        )
    )
    (<= 1
        (+
            (prittles 1)
            (prittles 2)
            (prittles 3)
            (prittles 4)
            (prittles 5)
            (prittles 6)
        )

    )
    (= 8
        (+
            (skipples 1)
            (skipples 2)
            (skipples 3)
            (skipples 4)
            (skipples 5)
            (skipples 6)
        )

    )
    (= 8
        (+
            (crottles 1)
            (crottles 2)
            (crottles 3)
            (crottles 4)
            (crottles 5)
            (crottles 6)
        )

    )
    (= 12
        (+
            (dupples 1)
            (dupples 2)
            (dupples 3)
            (dupples 4)
            (dupples 5)
            (dupples 6)
        )

    )
    ; each truck can only carry 8000kg or less
    (weightLimit (nuzzles 1)(prittles 1)(skipples 1)(crottles 1)(dupples 1))
    (weightLimit (nuzzles 2)(prittles 2)(skipples 2)(crottles 2)(dupples 2))
    (weightLimit (nuzzles 3)(prittles 3)(skipples 3)(crottles 3)(dupples 3))
    (weightLimit (nuzzles 4)(prittles 4)(skipples 4)(crottles 4)(dupples 4))
    (weightLimit (nuzzles 5)(prittles 5)(skipples 5)(crottles 5)(dupples 5))
    (weightLimit (nuzzles 6)(prittles 6)(skipples 6)(crottles 6)(dupples 6))
    
    ;8 pellets on each truck
    (maxPallets (nuzzles 1)(prittles 1)(skipples 1)(crottles 1)(dupples 1))
    (maxPallets (nuzzles 2)(prittles 2)(skipples 2)(crottles 2)(dupples 2))
    (maxPallets (nuzzles 3)(prittles 3)(skipples 3)(crottles 3)(dupples 3))
    (maxPallets (nuzzles 4)(prittles 4)(skipples 4)(crottles 4)(dupples 4))
    (maxPallets (nuzzles 5)(prittles 5)(skipples 5)(crottles 5)(dupples 5))
    (maxPallets (nuzzles 6)(prittles 6)(skipples 6)(crottles 6)(dupples 6))

    ; cant have negative amount on a truck
    (and
        (>= (nuzzles 1) 0) (>= (nuzzles 2) 0) (>= (nuzzles 3) 0) (>= (nuzzles 4) 0) (>= (nuzzles 5) 0) (>= (nuzzles 6) 0)
        (>= (prittles 1) 0) (>= (prittles 2) 0) (>= (prittles 3) 0) (>= (prittles 4) 0) (>= (prittles 5) 0) (>= (prittles 6) 0)
        (>= (skipples 1) 0) (>= (skipples 2) 0) (>= (skipples 3) 0) (>= (skipples 4) 0) (>= (skipples 5) 0) (>= (skipples 6) 0)
        (>= (crottles 1) 0) (>= (crottles 2) 0) (>= (crottles 3) 0) (>= (crottles 4) 0) (>= (crottles 5) 0) (>= (crottles 6) 0)
        (>= (dupples 1) 0) (>= (dupples 2) 0) (>= (dupples 3) 0) (>= (dupples 4) 0) (>= (dupples 5) 0) (>= (dupples 6) 0)
    )
    ; no 2 nuzzles may be on the same truck
    (and
        (< (nuzzles 1) 2) (< (nuzzles 2) 2) (< (nuzzles 3) 2) (< (nuzzles 4) 2) (< (nuzzles 5) 2) (< (nuzzles 6) 2)
    )
    ; only 2 trucks can carry skipples
    (<= 2
        (+
            (ite (> (skipples 1) 0) 1 0)
            (ite (> (skipples 2) 0) 1 0)
            (ite (> (skipples 3) 0) 1 0)
            (ite (> (skipples 4) 0) 1 0)
            (ite (> (skipples 5) 0) 1 0)
            (ite (> (skipples 6) 0) 1 0)
        )
    )
))




(check-sat)
(echo "Truck 1 contains the following: ")
(get-value ((nuzzles 1) (prittles 1) (skipples 1) (crottles 1) (dupples 1)))
(echo "Amount Truck 1 carries: ")
(get-value ((+ (nuzzles 1) (prittles 1) (skipples 1) (crottles 1) (dupples 1))))
(echo "Weight Truck 1 carries: ")
(get-value ((+ (* 800 (nuzzles 1))(* 1300 (prittles 1))(* 1000 (skipples 1))(* 1500 (crottles 1))(* 400 (dupples 1)))))

(echo "")
(echo "Truck 2 contains the following: ")
(get-value ((nuzzles 2) (prittles 2) (skipples 2) (crottles 2) (dupples 2)))
(echo "Amount Truck 2 carries: ")
(get-value ((+ (nuzzles 2) (prittles 2) (skipples 2) (crottles 2) (dupples 2))))
(echo "Weight Truck 2 carries: ")
(get-value ((+ (* 800 (nuzzles 2))(* 1300 (prittles 2))(* 1000 (skipples 2))(* 1500 (crottles 2))(* 400 (dupples 2)))))

(echo "")
(echo "Truck 3 contains the following: ")
(get-value ((nuzzles 3) (prittles 3) (skipples 3) (crottles 3) (dupples 3)))
(echo "Amount Truck 3 carries: ")
(get-value ((+ (nuzzles 3) (prittles 3) (skipples 3) (crottles 3) (dupples 3))))
(echo "Weight Truck 3 carries: ")
(get-value ((+ (* 800 (nuzzles 3))(* 1300 (prittles 3))(* 1000 (skipples 3))(* 1500 (crottles 3))(* 400 (dupples 3)))))

(echo "")
(echo "Truck 4 contains the following: ")
(get-value ((nuzzles 4) (prittles 4) (skipples 4) (crottles 4) (dupples 4)))
(echo "Amount Truck 4 carries: ")
(get-value ((+ (nuzzles 4) (prittles 4) (skipples 4) (crottles 4) (dupples 4))))
(echo "Weight Truck 4 carries: ")
(get-value ((+ (* 800 (nuzzles 4))(* 1300 (prittles 4))(* 1000 (skipples 4))(* 1500 (crottles 4))(* 400 (dupples 4)))))

(echo "")
(echo "Truck 5 contains the following: ")
(get-value ((nuzzles 5) (prittles 5) (skipples 5) (crottles 5) (dupples 5)))
(echo "Amount Truck 5 carries: ")
(get-value ((+ (nuzzles 5) (prittles 5) (skipples 5) (crottles 5) (dupples 5))))
(echo "Weight Truck 5 carries: ")
(get-value ((+ (* 800 (nuzzles 5))(* 1300 (prittles 5))(* 1000 (skipples 5))(* 1500 (crottles 5))(* 400 (dupples 5)))))

(echo "")
(echo "Truck 6 contains the following: ")
(get-value ((nuzzles 6) (prittles 6) (skipples 6) (crottles 6) (dupples 6)))
(echo "Amount Truck 6 carries: ")
(get-value ((+ (nuzzles 6) (prittles 6) (skipples 6) (crottles 6) (dupples 6))))
(echo "Weight Truck 6 carries: ")
(get-value ((+ (* 800 (nuzzles 6))(* 1300 (prittles 6))(* 1000 (skipples 6))(* 1500 (crottles 6))(* 400 (dupples 6)))))