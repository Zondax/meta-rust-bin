
def get_by_triple(hashes, triple):
    try:
        return hashes[triple]
    except:
        raise bb.parse.SkipRecipe("Unsupported triple: %s" % triple)


def rust_std_md5(triple):
    HASHES = {
        "aarch64-unknown-linux-gnu": "78858dbfc9d1b71cbeee552e31f26b7c",
        "aarch64-unknown-linux-musl": "baab41f8df0fc118773400ef831a591e",
        "arm-unknown-linux-gnueabi": "555df90f9e3e60534c456c12796dac50",
        "arm-unknown-linux-gnueabihf": "664aeca39754a9fdf6cdcb48bdade761",
        "armv5te-unknown-linux-gnueabi": "86bc292723ed65667a0946f54356fcc0",
        "armv5te-unknown-linux-musleabi": "018f776330cd7dffeb386117275837b6",
        "armv7-unknown-linux-gnueabihf": "d546b3a869462d1d445d8b12f0a9fdf4",
        "armv7-unknown-linux-musleabihf": "d1ce68fcaedd0fda9d692619a8d533b6",
        "i686-unknown-linux-gnu": "7b3fdcf31844234fccebb1a1ca600cc8",
        "mips-unknown-linux-gnu": "7ca699c9d83bda264a3a9e5dbf893555",
        "mipsel-unknown-linux-gnu": "29c8e5cce0e64bc2db30ef140b13b71f",
        "powerpc-unknown-linux-gnu": "86ac62a319f536356a36803c527e1160",
        "x86_64-unknown-linux-gnu": "8117292f5ad013c1bcfdde47dfcfeb48",
    }
    return get_by_triple(HASHES, triple)

def rust_std_sha256(triple):
    HASHES = {
        "aarch64-unknown-linux-gnu": "87d97c1bab5109c9ac7805764f5b3e5784be58d8df2a5a800b9a9de8378e2dfa",
        "aarch64-unknown-linux-musl": "4c178b258eb2c4b999754f4bf869256538ffcc9062c683d45e097369db3ba4af",
        "arm-unknown-linux-gnueabi": "8c3a5f17eaa74b7543cc3eaa80b31b1aeb21c566fba5f87563f045521942a318",
        "arm-unknown-linux-gnueabihf": "537180b30475a356b317eb9cfc03a47958144c9a5b0a73c6fd8709064c5a8cb9",
        "armv5te-unknown-linux-gnueabi": "3e10a0795803f7daa6b64867308f8fb48781b8cdd934406577e833600bab420b",
        "armv5te-unknown-linux-musleabi": "f6c608a10b29e21551f3bc763433b50b1e14120a3759031c1a799b48d28b9594",
        "armv7-unknown-linux-gnueabihf": "670645f8421babaa4987b29dcb0394332501a0e904e6777e169876ee8b1bab7c",
        "armv7-unknown-linux-musleabihf": "3cfd955f37b5f965b20b1bb0a5d0fd8035f6d472c9c764f4f89a1c36714b0c5f",
        "i686-unknown-linux-gnu": "b2c0479dff1bd28ce7b348d08e2caf807e3da1ebab6d4606e45948b232cfbcc4",
        "mips-unknown-linux-gnu": "56723d6bf6bbb282986f0812072878d049b6c60f89aaf40570f3399db056e1e1",
        "mipsel-unknown-linux-gnu": "c031b4bb29b66cfbc2629440c59829a9101d7adaecc5892ded6db0e43f087ce9",
        "powerpc-unknown-linux-gnu": "6935c12cacca445ec47f74442ef3801a5cea33e01afe829d13f4b4e09b1a4b9c",
        "x86_64-unknown-linux-gnu": "ca9a02255007b8ed2588f2cdc23596c5b0584a6172116235192ac5a081749d12",
    }
    return get_by_triple(HASHES, triple)

def rustc_md5(triple):
    HASHES = {
        "aarch64-unknown-linux-gnu": "064166448fd7c0ef2d2b413ecd534c1e",
        "arm-unknown-linux-gnueabi": "4f1b98edf259eaa44790c8be2e389329",
        "arm-unknown-linux-gnueabihf": "af38d86a0efb15f962c7124ec65d58a0",
        "armv7-unknown-linux-gnueabihf": "d3388dbead2195459479f0070b395208",
        "i686-unknown-linux-gnu": "da8154dfa457994be8ab1d63cbec8824",
        "x86_64-unknown-linux-gnu": "63a46e179303376f4bb000f757db3635",
    }
    return get_by_triple(HASHES, triple)

def rustc_sha256(triple):
    HASHES = {
        "aarch64-unknown-linux-gnu": "c13bb7b147130d468efb255e7fecb9d9ad9b69297725b511504ce731664888d1",
        "arm-unknown-linux-gnueabi": "fbfbe99ed75a0f8e2257b16e0af5d20b0e7726725b592599de46e276cfeb7490",
        "arm-unknown-linux-gnueabihf": "f14e76be8bfb020892d953f7ca214f3b7c289bcc2c90576e1fb5be4713b21cfc",
        "armv7-unknown-linux-gnueabihf": "e88717f39e0b5e90fc1ef6248ac71f890b9bf8b5e5ae62f69b0a07b7a9c7f6ae",
        "i686-unknown-linux-gnu": "585639667965ce76ed5bc47041dd323bdae1b72f454a08beefe529eb080d54d1",
        "x86_64-unknown-linux-gnu": "1b921ab0b435503d3c2596e4cfd81ae0d44ce0d9b271b0c7f4d8ccf197a22c03",
    }
    return get_by_triple(HASHES, triple)

LIC_FILES_CHKSUM = "file://COPYRIGHT;md5=93a95682d51b4cb0a633a97046940ef0"

require rust-bin-cross-nightly.inc
