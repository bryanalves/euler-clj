(ns euler-clj.core)

(defn run-problem [n]
  (let [problem-num (.format (new java.text.DecimalFormat "000") n)
        problem-ns (symbol (str "euler-clj.problem-" problem-num))
        req-vec (vec (list problem-ns))]
    (require req-vec)
    ((ns-resolve problem-ns 'run))))

(defn -main
  "Runs solutions"
  [& args]
  (println (time (run-problem (Integer/parseInt (first args))))))
