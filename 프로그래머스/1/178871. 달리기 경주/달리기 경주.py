def solution(players, callings):
    player_positions = {player: i for i, player in enumerate(players)}
    
    for name in callings:
        current_position = player_positions[name]
        
        if current_position > 0:
            previous_player = players[current_position - 1]
            
            players[current_position - 1], players[current_position] = players[current_position], players[current_position - 1]
            
            player_positions[name] -= 1
            player_positions[previous_player] += 1
    
    return players