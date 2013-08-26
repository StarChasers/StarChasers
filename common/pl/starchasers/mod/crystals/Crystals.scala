package pl.starchasers.mod.crystals

import codechicken.multipart.MultiPartRegistry.IPartFactory

object Crystals {
	val partFactory : IPartFactory = new CrystalPartFactory
}