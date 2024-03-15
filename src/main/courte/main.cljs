(ns courte.main)

(defn init []
  ;; Deno.serve (() => new Response ("Hello, world!"));

  ((-> js/Deno .-serve) (fn [] (new js/Response "Hello work"))))