---
title: "user resource type"
description: "**TODO: Add Description**"
author: "**TODO: Provide Github Name. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
localization_priority: Normal
ms.prod: "**TODO: Add MS prod. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
doc_type: resourcePageType
---

# user resource type

Namespace: microsoft.graph

**TODO: Add Description**

## Methods
|Method|Return type|Description|
|:---|:---|:---|
|[List users](../api/user-list.md)|[user](../resources/user.md) collection|Get a list of the [user](../resources/user.md) objects and their properties.|
|[Create user](../api/user-create.md)|[user](../resources/user.md)|Create a new [user](../resources/user.md) object.|
|[Get user](../api/user-get.md)|[user](../resources/user.md)|Read the properties and relationships of a [user](../resources/user.md) object.|
|[Update user](../api/user-update.md)|[user](../resources/user.md)|Update the properties of a [user](../resources/user.md) object.|
|[Delete user](../api/user-delete.md)|None|Deletes a [user](../resources/user.md) object.|
|[List appConsentRequestsForApproval](../api/user-list-appconsentrequestsforapproval.md)|[appConsentRequest](../resources/appconsentrequest.md) collection|Get the appConsentRequest resources from the appConsentRequestsForApproval navigation property.|
|[Create appConsentRequestsForApproval](../api/user-post-appconsentrequestsforapproval.md)|[appConsentRequest](../resources/appconsentrequest.md)|Create a new appConsentRequest object.|
|[Get appConsentRequestsForApproval](../api/user-get-appconsentrequest.md)|[appConsentRequest](../resources/appconsentrequest.md)|Read the properties and relationships of an [appConsentRequest](../resources/appconsentrequest.md) object.|
|[Update appConsentRequestsForApproval](../api/user-update-appconsentrequestsforapproval.md)|[appConsentRequest](../resources/appconsentrequest.md)|Update the properties of an appConsentRequestsForApproval object.|
|[Delete appConsentRequestsForApproval](../api/user-delete-appconsentrequestsforapproval.md)|None|Delete an [appConsentRequest](../resources/appconsentrequest.md) object.|
|[List approvals](../api/user-list-approvals.md)|[approval](../resources/approval.md) collection|Get the approval resources from the approvals navigation property.|
|[Create approvals](../api/user-post-approvals.md)|[approval](../resources/approval.md)|Create a new approval object.|
|[Get approvals](../api/user-get-approval.md)|[approval](../resources/approval.md)|Read the properties and relationships of an [approval](../resources/approval.md) object.|
|[Update approvals](../api/user-update-approvals.md)|[approval](../resources/approval.md)|Update the properties of an approvals object.|
|[Delete approvals](../api/user-delete-approvals.md)|None|Delete an [approval](../resources/approval.md) object.|
|[List pendingAccessReviewInstances](../api/user-list-pendingaccessreviewinstances.md)|[accessReviewInstance](../resources/accessreviewinstance.md) collection|Get the accessReviewInstance resources from the pendingAccessReviewInstances navigation property.|
|[Create pendingAccessReviewInstances](../api/user-post-pendingaccessreviewinstances.md)|[accessReviewInstance](../resources/accessreviewinstance.md)|Create a new accessReviewInstance object.|
|[Get pendingAccessReviewInstances](../api/user-get-accessreviewinstance.md)|[accessReviewInstance](../resources/accessreviewinstance.md)|Read the properties and relationships of an [accessReviewInstance](../resources/accessreviewinstance.md) object.|
|[Update pendingAccessReviewInstances](../api/user-update-pendingaccessreviewinstances.md)|[accessReviewInstance](../resources/accessreviewinstance.md)|Update the properties of a pendingAccessReviewInstances object.|
|[Delete pendingAccessReviewInstances](../api/user-delete-pendingaccessreviewinstances.md)|None|Delete an [accessReviewInstance](../resources/accessreviewinstance.md) object.|

## Properties
|Property|Type|Description|
|:---|:---|:---|

## Relationships
|Relationship|Type|Description|
|:---|:---|:---|
|appConsentRequestsForApproval|[appConsentRequest](../resources/appconsentrequest.md) collection|**TODO: Add Description**|
|approvals|[approval](../resources/approval.md) collection|**TODO: Add Description**|
|pendingAccessReviewInstances|[accessReviewInstance](../resources/accessreviewinstance.md) collection|**TODO: Add Description**|

## JSON representation
The following is a JSON representation of the resource.
<!-- {
  "blockType": "resource",
  "keyProperty": "id",
  "@odata.type": "microsoft.graph.user",
  "baseType": "",
  "openType": false
}
-->
``` json
{
  "@odata.type": "#microsoft.graph.user"
}
```

