class Solution(object):
    def findCircleNum(self, isConnected):
        """
        :type isConnected: List[List[int]]
        :rtype: int
        """
        n = len(isConnected)
        visited = [False] * n
        provinces = 0

        def dfs(city):
            for neighbour in range(n):
                if isConnected[city][neighbour] == 1 and not visited[neighbour]:
                    visited[neighbour] = True
                    dfs(neighbour)
        for i in range(n):
            if not visited[i]:
                provinces += 1
                visited[i] = True
                dfs(i)

        return provinces
        
