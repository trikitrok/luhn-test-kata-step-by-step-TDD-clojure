(ns luhn-test.core)

(defn- reduce-numbers [numbers]
  (+ (first numbers)
     (* 2 (second numbers))
     (get (vec numbers) 2 0)
     (* 2 (get (vec numbers) 3 0))))

(defn valid? [digits]
  (let [numbers (map #(Integer/parseInt (str %)) (reverse digits))]
    (if (= 1 (count numbers))
      (zero? (first numbers))
      (= 10 (reduce-numbers numbers)))))
