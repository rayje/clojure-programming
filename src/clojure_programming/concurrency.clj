(ns clojure-programming.concurrency)

;(def d (delay (println "Running...") :done!))

(defn get-document
  [id]
  {:url "https://www.mozilla.org/en-US/about/manifesto/"
   :title "The Mozilla Manifesto"
   :mime "text/html"
   :content (future (slurp "https://www.mozilla.org/en-US/about/manifesto/"))})

;(def long-calculation (future (apply + (range 1e8))))

(defn call-service
  [arg1 arg2 callback-fn]
  (future (callback-fn (+ arg1 arg2) (- arg1 arg2))))

(defn sync-fn
  [async-fn]
  (fn [& args]
    (let [result (promise)]
      (apply async-fn (conj (vec args) #(deliver result %&)))
      @result)))
