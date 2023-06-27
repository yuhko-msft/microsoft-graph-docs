---
description: "Automatically generated file. DO NOT MODIFY"
---

```go


import (
	  "context"
	  msgraphsdk "github.com/microsoftgraph/msgraph-beta-sdk-go"
	  graphsites "github.com/microsoftgraph/msgraph-beta-sdk-go/sites"
	  //other-imports
)

graphClient, err := msgraphsdk.NewGraphServiceClientWithCredentials(cred, scopes)


requestParameters := &graphsites.SiteItemTermStoreGroupItemRequestBuilderGetQueryParameters{
	Select: [] string {"*","parentSiteId"},
}
configuration := &graphsites.SiteItemTermStoreGroupItemRequestBuilderGetRequestConfiguration{
	QueryParameters: requestParameters,
}

result, err := graphClient.Sites().BySiteId("site-id").TermStore().Groups().ByGroupId("group-id").Get(context.Background(), configuration)


```