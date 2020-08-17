(ns stock.produto)

(defn should-apply-discount
  [value]
  (> value 100))

(defn discounted-price
  [price]
  (if (should-apply-discount price)
    (- price (* price 0.10))
    (price)))