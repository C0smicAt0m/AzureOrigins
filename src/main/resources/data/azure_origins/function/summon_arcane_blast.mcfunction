execute as @s at @s run summon minecraft:armor_stand ^ ^0.5 ^1 {Tags:[magicshot],NoGravity:1b,Small:1b,Invisible:1b,Invulnerable:1b}
execute as @e[tag=magicshot] run data modify entity @s Rotation set from entity @p Rotation
tag @e[tag=magicshot] add magicprimed
tag @e[tag=magicprimed] remove magicshot
playsound item.trident.return player @a ~ ~ ~