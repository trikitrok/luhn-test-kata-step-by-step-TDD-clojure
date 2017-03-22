(ns luhn-test.core)

(defn- reduce-numbers [numbers]
  (apply + (map-indexed #(if (even? %1) %2 (* 2 %2)) numbers)))

(defn valid? [digits]
  (let [numbers (map #(Integer/parseInt (str %)) (reverse digits))]
    (if (= 1 (count numbers))
      (zero? (first numbers))
      (or (= 10 (reduce-numbers numbers))
          (= 20 (reduce-numbers numbers))))))
