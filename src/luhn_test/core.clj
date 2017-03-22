(ns luhn-test.core)

(def ^:private sum-digits #(+ (quot % 10) (mod % 10)))

(defn- reduce-numbers [numbers]
  (apply +
         (map sum-digits
           (map-indexed #(if (even? %1) %2 (* 2 %2)) numbers))))

(defn valid? [digits]
  (let [numbers (map #(Integer/parseInt (str %)) (reverse digits))]
    (zero? (mod (reduce-numbers numbers) 10))))
