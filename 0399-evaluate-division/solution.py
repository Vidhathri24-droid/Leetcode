class Solution(object):
    def calcEquation(self, equations, values, queries):
        """
        :type equations: List[List[str]]
        :type values: List[float]
        :type queries: List[List[str]]
        :rtype: List[float]
        """
        graph = defaultdict(list)
        for (a,b), value in zip(equations, values):
            graph[a].append((b,value))
            graph[b].append((a,1/value))

        def dfs(start, end, visited, product):
            if start not in graph:
                return -1.0
            if start == end:
                return product

            visited.add(start)

            for neighbour, value in graph[start]:
                if neighbour not in visited:
                    result = dfs(neighbour, end, visited, product * value)
                    if result != -1.0:
                        return result
            return -1.0

        results = []

        for a, b in queries:
            visited = set()
            results.append(dfs(a,b,visited,1))

        return results
