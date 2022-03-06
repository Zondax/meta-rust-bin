
# Recipe for cargo 20220306
# This corresponds to rust release nightly 2022-03-06

def get_by_triple(hashes, triple):
    try:
        return hashes[triple]
    except:
        raise bb.parse.SkipRecipe("Unsupported triple: %s" % triple)

def cargo_md5(triple):
    HASHES = {
        "aarch64-unknown-linux-gnu": "1f343f52e413327ce6be8f501da1f116",
        "arm-unknown-linux-gnueabi": "3597461856b9429673a76e1346fe73d7",
        "arm-unknown-linux-gnueabihf": "6d83207e5424a7107cc65fe847ece56c",
        "armv7-unknown-linux-gnueabihf": "077aedbe8ff32b72b04692f59ec1d522",
        "i686-unknown-linux-gnu": "8594b840c4cd658d9b84675ab68a11d8",
        "x86_64-unknown-linux-gnu": "7803c2968edec950d831bd18dfc6fdeb",
    }
    return get_by_triple(HASHES, triple)

def cargo_sha256(triple):
    HASHES = {
        "aarch64-unknown-linux-gnu": "0eaf9adc9125306f15db837bb497b29dae8d9a2964f074e2ecf1f2f35de10a0d",
        "arm-unknown-linux-gnueabi": "c2731e6cd784e49f4a58e58fa6b46c33f0960ab21bce34157afc846fe6e991c9",
        "arm-unknown-linux-gnueabihf": "4a7f15ab544334979369cc93da0310883c99b1fc7cffade6c94988bee2537c4d",
        "armv7-unknown-linux-gnueabihf": "5fbeba01fe73e93426aa414cae23f91a3966b04184d1649f5e7f5c405f27a5fb",
        "i686-unknown-linux-gnu": "328fd27da584695d14c616c33bde0047bb9c1ee1609a53168e96bd40a9028aed",
        "x86_64-unknown-linux-gnu": "9dc44046afaee7c46e79c8e7ac9fc2f2ce85e92a2b69319142ce6cc038418120",
    }
    return get_by_triple(HASHES, triple)

def cargo_url(triple):
    URLS = {
        "aarch64-unknown-linux-gnu": "https://static.rust-lang.org/dist/2022-03-06/cargo-nightly-aarch64-unknown-linux-gnu.tar.gz",
        "arm-unknown-linux-gnueabi": "https://static.rust-lang.org/dist/2022-03-06/cargo-nightly-arm-unknown-linux-gnueabi.tar.gz",
        "arm-unknown-linux-gnueabihf": "https://static.rust-lang.org/dist/2022-03-06/cargo-nightly-arm-unknown-linux-gnueabihf.tar.gz",
        "armv7-unknown-linux-gnueabihf": "https://static.rust-lang.org/dist/2022-03-06/cargo-nightly-armv7-unknown-linux-gnueabihf.tar.gz",
        "i686-unknown-linux-gnu": "https://static.rust-lang.org/dist/2022-03-06/cargo-nightly-i686-unknown-linux-gnu.tar.gz",
        "x86_64-unknown-linux-gnu": "https://static.rust-lang.org/dist/2022-03-06/cargo-nightly-x86_64-unknown-linux-gnu.tar.gz",
    }
    return get_by_triple(URLS, triple)

DEPENDS += "rust-bin-cross-${TARGET_ARCH} (= 2022-03-06)"
LIC_FILES_CHKSUM = "\
    file://LICENSE-APACHE;md5=71b224ca933f0676e26d5c2e2271331c \
    file://LICENSE-MIT;md5=b377b220f43d747efdec40d69fcaa69d \
"

require cargo-bin-cross-nightly.inc
