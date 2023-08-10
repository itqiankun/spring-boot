local currentQuantity = tonumber(redis.call("GET",  KEYS[1]))
if currentQuantity <= 0 then
    return "false"
end
redis.call("DECR",  KEYS[1])
return "true"
