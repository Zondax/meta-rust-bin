
def get_by_triple(hashes, triple):
    try:
        return hashes[triple]
    except:
        raise bb.parse.SkipRecipe("Unsupported triple: %s" % triple)


def rust_std_md5(triple):
    HASHES = {
        "aarch64-unknown-linux-gnu": "b3384d0fe3d431a712269ad9b2c7968f",
        "aarch64-unknown-linux-musl": "017d4afd91bf76d695afbe2889aa09e2",
        "arm-unknown-linux-gnueabi": "69fa1b0f5719e063ba70e74d92cf276d",
        "arm-unknown-linux-gnueabihf": "e19d5819b638d6496b8001ab6b984c3f",
        "armv5te-unknown-linux-gnueabi": "1ab625d34f0ddedcff143fae4164af10",
        "armv5te-unknown-linux-musleabi": "503ffcd0952bada47b5eca3a26a7cc96",
        "armv7-unknown-linux-gnueabihf": "04fed882369a729746e3187a18c1df95",
        "armv7-unknown-linux-musleabihf": "e6b3adb1243b3e426f0dea208339382f",
        "i686-unknown-linux-gnu": "546fc921e9c6207a735fe28b3d16bdeb",
        "mips-unknown-linux-gnu": "63740cadd2a2118ad32572abb4ed9cba",
        "mipsel-unknown-linux-gnu": "e2a92749b7f080e56396bfa29104ff05",
        "powerpc-unknown-linux-gnu": "8d434662c8388aa44bb78e2d41f03082",
        "x86_64-unknown-linux-gnu": "00c822fc2dc2b2e7df8819cc7ea5f804",
    }
    return get_by_triple(HASHES, triple)

def rust_std_sha256(triple):
    HASHES = {
        "aarch64-unknown-linux-gnu": "c97a09ed8a0dd9cb5d959ac32deaebd455cdd6d2f48f7385183a56db1beeebff",
        "aarch64-unknown-linux-musl": "690773ebd5e32de4afee6cea5256b0b2eb2886681bd19678a30d05e1a264b5f5",
        "arm-unknown-linux-gnueabi": "8b16ad1c99ef09f49be6c156f6c14684a2ef9b7e38c1b3449999912e749182ab",
        "arm-unknown-linux-gnueabihf": "41b3552aeedd74de00aabc936a1234a047efef509e6fc0f3984bac158792c52f",
        "armv5te-unknown-linux-gnueabi": "dcfab6f40793c24780e2bfefc499a2e7355b19462fab3c836da3350f06bb52a4",
        "armv5te-unknown-linux-musleabi": "29c6f4a02e3779a58b642e4ee918774f77edb708bc2fdf7192b15c275be79538",
        "armv7-unknown-linux-gnueabihf": "d9223465f08bcc8394a11ebbd897cddafaa28c2b504ee13feb264a6eba942307",
        "armv7-unknown-linux-musleabihf": "4ca546d6651ecb4ef2d29ef1c0b69d8677bd4653f23f86ce612ee5c45dd4cc1f",
        "i686-unknown-linux-gnu": "4f3290c8a67874c0f70d06f03002d0cc6598541b4018e251d2e21a450fc87062",
        "mips-unknown-linux-gnu": "f56c8f0d6d01abfb6eaf79f1d9b4ae515eb1f3c532957fcec445d162cc6049c5",
        "mipsel-unknown-linux-gnu": "48a90b5a6b5ad980daa705b39c80020d84bfecfe2c8ec4dfb163bdb5bd753fd4",
        "powerpc-unknown-linux-gnu": "208ca2d60d8000a7b71ec262a53fa534cdb0bb411a43c8997e5ff2f62ee302ec",
        "x86_64-unknown-linux-gnu": "76d62fb8a17a7bb6e3c86071e33c91cb68a794b705a7e67209b4fb91163c851b",
    }
    return get_by_triple(HASHES, triple)

def rustc_md5(triple):
    HASHES = {
        "aarch64-unknown-linux-gnu": "ce1a3d2c2639a205082d05718f790371",
        "arm-unknown-linux-gnueabi": "358bd7459f1d6470a0daf12e692d1e7f",
        "arm-unknown-linux-gnueabihf": "48ca19e9c6f0a25bb4e19982df24d4a0",
        "armv7-unknown-linux-gnueabihf": "037e2f656fe7eea79e6785f9817b94ef",
        "i686-unknown-linux-gnu": "afdcd151603bb944a4b2c5357fd766f5",
        "x86_64-unknown-linux-gnu": "ff729f015c18c973d94e209146abd7ed",
    }
    return get_by_triple(HASHES, triple)

def rustc_sha256(triple):
    HASHES = {
        "aarch64-unknown-linux-gnu": "33d3cf52dcb3b73faec5d215fa4f6e84b7b3fb04caf9351b64761d2c00674efe",
        "arm-unknown-linux-gnueabi": "83f6e87fec3b61825bcd1cc37c6a335ddf61baf4813e0328528fe14d82dea17c",
        "arm-unknown-linux-gnueabihf": "6510a7c64ff566541a89e4e01ad7a6008e9e8405c8a64b4ffb8c0247d37c045c",
        "armv7-unknown-linux-gnueabihf": "e1278171b84f87e333379a67e0b8bffdc383b693dd0a0af1ced68068ac29a6fc",
        "i686-unknown-linux-gnu": "3e2a868faf8100fb18491fb9c1f3daba58aa3ce9b64a603f5e5d675c6f3b71dc",
        "x86_64-unknown-linux-gnu": "f9918436917bdcaa6d8ea273e4f1cd9db1d16e11bc3eb3b8d72da9598bd741e8",
    }
    return get_by_triple(HASHES, triple)

LIC_FILES_CHKSUM = "file://COPYRIGHT;md5=93a95682d51b4cb0a633a97046940ef0"

require rust-bin-cross.inc
