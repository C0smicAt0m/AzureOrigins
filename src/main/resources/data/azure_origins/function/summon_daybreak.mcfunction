execute as @s at @s run summon minecraft:armor_stand ^ ^0.5 ^1 {Tags:[daybreak],NoGravity:1b,Small:1b,Invisible:1b,Invulnerable:1b}
execute as @e[tag=daybreak] run data modify entity @s Rotation set from entity @p Rotation
tag @e[tag=daybreak] add daybreakprimed
tag @e[tag=daybreakprimed] remove daybreak
playsound minecraft:item.firecharge.use