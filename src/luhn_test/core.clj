(ns luhn-test.core)

(def ^:private sum-digits #(+ (quot % 10) (mod % 10)))

(defn- double-when-at-even-position [position num]
  (if (even? position) num (* 2 num)))

(defn- reduce-numbers [numbers]
  (->> (map-indexed double-when-at-even-position numbers)
       (map sum-digits)
       (apply +)))

(defn valid? [digits]
  (let [numbers (map #(Integer/parseInt (str %)) (reverse digits))]
    (zero? (mod (reduce-numbers numbers) 10))))
