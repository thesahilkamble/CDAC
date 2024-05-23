import asyncio

async def read_file(filename):
    try:
        with open(filename, 'r') as file:
            content = await asyncio.to_thread(file.read)
            return content
    except FileNotFoundError:
        return None

async def main():
    filenames = ['mydata.txt', 'myfile.data']
    tasks = [read_file(filename) for filename in filenames]

    results = await asyncio.gather(*tasks)

    for filename, content in zip(filenames, results):
        if content is not None:
            word_count = len(content.split())
            print(f"File '{filename}' contains {word_count} words.")
        else:
            print(f"File '{filename}' not found.")

if __name__ == "__main__":
    asyncio.run(main())
