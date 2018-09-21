import asyncio
import requests

async def main():

    loop = asyncio.get_event_loop()
    futures = [
        loop.run_in_executor(
            None,
            requests.get,
            'https://7xs8kng6wj.execute-api.ap-southeast-2.amazonaws.com/production/ping'
        )
        for i in range(20)
    ]
    for response in await asyncio.gather(*futures):
        pass

loop = asyncio.get_event_loop()
loop.run_until_complete(main())