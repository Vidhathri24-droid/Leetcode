class Solution(object):
    def floodFill(self, image, sr, sc, color):
        """
        :type image: List[List[int]]
        :type sr: int
        :type sc: int
        :type color: int
        :rtype: List[List[int]]
        """
        rows = len(image)
        cols = len(image[0])

        original_color = image[sr][sc]
        if original_color == color:
            return image

        queue = deque()
        queue.append((sr,sc))
        image[sr][sc] = color

        directions = [(1,0),(-1,0),(0,1),(0,-1)]

        while queue:
            x, y = queue.popleft()

            for dx, dy in directions:
                nx = x + dx
                ny = y + dy

                if 0 <= nx < rows and 0 <= ny < cols:
                    if image[nx][ny] == original_color:
                        image[nx][ny] = color
                        queue.append((nx,ny))

        return image
        
