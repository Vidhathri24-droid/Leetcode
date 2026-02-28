class Solution(object):
    def canVisitAllRooms(self, rooms):
        """
        :type rooms: List[List[int]]
        :rtype: bool
        """
        n = len(rooms)
        visited = [False] * n

        def dfs(room):
            visited[room] = True

            for key in rooms[room]:
                if not visited[key]:
                    dfs(key)

        dfs(0)

        for v in visited:
            if not v:
                return False
        return True
