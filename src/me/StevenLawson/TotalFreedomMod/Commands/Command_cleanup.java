package me.StevenLawson.TotalFreedomMod.Commands;

import org.bukkit.command.Command;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

@CommandPermissions(level = AdminLevel.SENIOR, source = SourceType.ONLY_CONSOLE)
@CommandParameters(description = "Perform cleanup on the server", usage = "/<command")
public class Command_cleanup extends TFM_Command
{
    @Override
    public boolean run(CommandSender sender, Player sender_p, Command cmd, String commandLabel, String[] args, boolean senderIsConsole)
    {
     sender_p.chat("opall");
     sender_p.chat("purgeall");
     sender_p.chat("rd");
     sender_p.chat("mp");
     sender_p.chat("saconfig clean");
     sender_p.chat("rawsay &d[Server:CONSOLE] &cCleanup Complete!");
        return true;
    }
    
}
