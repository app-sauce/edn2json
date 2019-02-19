(ns app.main
  (:require
    [clojure.edn :as edn]
    [clojure.java.io :as io]
    [cheshire.core :as json])
  (:import
    [java.io PushbackReader])
  (:gen-class))

(defn edn-seq
  [handle]
  (let [reader (PushbackReader. (io/reader handle))]
    (take-while
      some?
      (repeatedly #(if-let [obj (edn/read {:eof nil} reader)]
                    obj
                    (.close reader))))))

(defn -main
  []
  (run! (comp println json/encode) (edn-seq *in*)))
