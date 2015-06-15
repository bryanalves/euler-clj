(ns euler-clj.problem-003
  (:use [clojure.contrib.lazy-seqs :only (primes)])
  (:use [clojure.contrib.math :only (sqrt)]))

(defn greatest-prime-factor [number]
  (reduce max (filter #(zero? (mod number %))
                      (take-while #(< % (sqrt number)) primes))))

(defn run []
  (greatest-prime-factor 600851475143))
