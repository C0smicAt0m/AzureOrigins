execute as @s at @s run summon minecraft:armor_stand ^ ^0.5 ^1 {Tags:[lunashock],NoGravity:1b,Small:1b,Invisible:1b,Invulnerable:1b}
execute as @e[tag=lunashock] run data modify entity @s Rotation set from entity @p Rotation
tag @e[tag=lunashock] add lunashockprimed
tag @e[tag=lunashockprimed] remove lunashock
playsound item.trident.return player @a ~ ~ ~