(ns luhn-test.core)

(def ^:private sum-digits #(+ (quot % 10) (mod % 10)))

(defn- double-when-at-even-position [position num]
  (if (even? (inc position)) (* 2 num) num))

(defn- reduce-digits [digits]
  (->> digits
       (reverse)
       (map #(Integer/parseInt (str %)))
       (map-indexed double-when-at-even-position)
       (map sum-digits)
       (apply +)))

(defn valid? [digits]
  (-> digits
      (reduce-digits)
      (mod 10)
      (zero?)))
