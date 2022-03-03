
# Recipe for cargo 20220303
# This corresponds to rust release nightly

def get_by_triple(hashes, triple):
    try:
        return hashes[triple]
    except:
        raise bb.parse.SkipRecipe("Unsupported triple: %s" % triple)

def cargo_md5(triple):
    HASHES = {
        "aarch64-unknown-linux-gnu": "354ea3ef5757385e03189a730c133d9d",
        "arm-unknown-linux-gnueabi": "ab6f4bb15d0d25739a1f3a531fe83926",
        "arm-unknown-linux-gnueabihf": "c0ac21a2adea8bd9bf38bf15ccdfd772",
        "armv7-unknown-linux-gnueabihf": "703724076b3682e2598f40ab03343313",
        "i686-unknown-linux-gnu": "7684e60a9f9c6ffcf1bdf42ff9ad6fdf",
        "x86_64-unknown-linux-gnu": "f8be4924a5e372ae0374a2547b901aa1",
    }
    return get_by_triple(HASHES, triple)

def cargo_sha256(triple):
    HASHES = {
        "aarch64-unknown-linux-gnu": "1e133fea41ebe737941c41b446822e13715d5ca8fa413c81ddca40fcb8d0def7",
        "arm-unknown-linux-gnueabi": "ee0292c75f7e7933b1fc7c526cdbebdeedce443b60049aa83fd2e4740022e2c3",
        "arm-unknown-linux-gnueabihf": "45af4994a834f554cbd7fe6f8fc2b59a3f96f7a96626ddc8e721fd2df404f3fa",
        "armv7-unknown-linux-gnueabihf": "27b004049866521da5f15ed67ecfdfa86e290991ddc7224d2b925f0fadfa37e9",
        "i686-unknown-linux-gnu": "afd99cf40b764c6b69eea0333b2802440bfb90020084ffb65c3c0bc8711728d9",
        "x86_64-unknown-linux-gnu": "b664e1083dc6bc789cfecbebb21ea7a1c6bc38513eadbea5ed26a93f13fae220",
    }
    return get_by_triple(HASHES, triple)

def cargo_url(triple):
    URLS = {
        "aarch64-unknown-linux-gnu": "https://static.rust-lang.org/dist/2022-03-03/cargo-nightly-aarch64-unknown-linux-gnu.tar.gz",
        "arm-unknown-linux-gnueabi": "https://static.rust-lang.org/dist/2022-03-03/cargo-nightly-arm-unknown-linux-gnueabi.tar.gz",
        "arm-unknown-linux-gnueabihf": "https://static.rust-lang.org/dist/2022-03-03/cargo-nightly-arm-unknown-linux-gnueabihf.tar.gz",
        "armv7-unknown-linux-gnueabihf": "https://static.rust-lang.org/dist/2022-03-03/cargo-nightly-armv7-unknown-linux-gnueabihf.tar.gz",
        "i686-unknown-linux-gnu": "https://static.rust-lang.org/dist/2022-03-03/cargo-nightly-i686-unknown-linux-gnu.tar.gz",
        "x86_64-unknown-linux-gnu": "https://static.rust-lang.org/dist/2022-03-03/cargo-nightly-x86_64-unknown-linux-gnu.tar.gz",
    }
    return get_by_triple(URLS, triple)

DEPENDS += "rust-bin-cross-${TARGET_ARCH} (= nightly)"
LIC_FILES_CHKSUM = "\
    file://LICENSE-APACHE;md5=71b224ca933f0676e26d5c2e2271331c \
    file://LICENSE-MIT;md5=b377b220f43d747efdec40d69fcaa69d \
"

require cargo-bin-cross.inc
