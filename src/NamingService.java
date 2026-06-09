import java.util.HashMap;
import java.util.Map;

/**
 * NamingService simulates distributed naming resolution.
 *
 * This class stores service names and maps them
 * to specific leaderboard nodes.
 */
public class NamingService {

    // Stores service name -> node mapping
    private Map<String, LeaderboardNode> serviceRegistry;

    /**
     * Constructor initializes the naming table.
     */
    public NamingService() {
        serviceRegistry = new HashMap<>();
    }

    /**
     * Registers a service name with a node.
     *
     * @param serviceName Name of service
     * @param node Leaderboard node
     */
    public void registerService(String serviceName, LeaderboardNode node) {
        serviceRegistry.put(serviceName, node);

        System.out.println("[NamingService] Registered: " + serviceName);
    }

    /**
     * Resolves a service name into a node.
     *
     * @param serviceName Name to resolve
     * @return LeaderboardNode
     */
    public LeaderboardNode resolve(String serviceName) {
        System.out.println("[NamingService] Resolving: " + serviceName);

        return serviceRegistry.get(serviceName);
    }
}
