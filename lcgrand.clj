; Linear Congruential Generator in clojure
; To be submitted to rosetta code

(defn pow [x n]
    (reduce * (repeat n x)))

; BSD implementation with a = 1103515245 and c = 12345
; a direct translation from haskell
(defn bsd [n]
    (lazy-seq
        (let [r (mod (+ (* n 1103515245) 12345) (pow 2 31))]
            (cons r (bsd r)))))

