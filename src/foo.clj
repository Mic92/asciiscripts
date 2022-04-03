(ns core)

;; $ lein repl
;; user=> (load-file "src/core.clj")
;; nil
;; user=> (load-file "src/foo.clj")

(-> "vmsh-demo_v1_uncut.asciinema.cast"
    read-cast
    (apply-ops [[:cut-start {:end [75]}]])
    #_(pp)
    (write-cast "output.cast"))
