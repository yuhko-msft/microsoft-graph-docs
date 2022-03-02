---
description: "Automatically generated file. DO NOT MODIFY"
---

```typescript

//THIS SNIPPET IS A PREVIEW FOR THE KIOTA BASED SDK. NON-PRODUCTION USE ONLY
const graphServiceClient = new GraphServiceClient(requestAdapter);

const requestBody = new Bookmark()
requestBody.description = "Book a fancy vacation in Tuscany or browse museums in Florence.";
async () => {
	await graphServiceClient.search.bookmarksById("bookmark-id").patch(requestBody);
}


```