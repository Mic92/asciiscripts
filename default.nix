with import <nixpkgs> {};
mkShell {
  nativeBuildInputs = [
    bashInteractive
    leiningen
    asciinema
  ];
}
