import com.github.c64lib.retroassembler.domain.AssemblerType

plugins {
    id("com.github.c64lib.retro-assembler") version "1.4.4"
}

repositories {
     mavenCentral()
}

retroProject {
    dialect = AssemblerType.KickAssembler
    dialectVersion = "5.22"
    libDirs = arrayOf(".ra/deps/c64lib", "build/charpad", "build/spritepad")
    srcDirs = arrayOf("src")
    excludes = arrayOf("**/_*.asm")

    libFromGitHub("c64lib/common", "develop")
    libFromGitHub("c64lib/chipset", "develop")
    libFromGitHub("c64lib/text", "develop")
    libFromGitHub("c64lib/copper64", "develop")
}
