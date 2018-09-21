import asyncio
import requests

async def main():

    loop = asyncio.get_event_loop()
    futures = [
        loop.run_in_executor(
            None,
            requests.get,
            'https://2013v1b5p4.execute-api.ap-southeast-2.amazonaws.com/Stage/ping'
        )
        for i in range(100)
    ]
    for response in await asyncio.gather(*futures):
        pass

loop = asyncio.get_event_loop()
loop.run_until_complete(main())