---
title: "Share files and folders in OneDrive and SharePoint"
description: "Multipurpose Internet Mail Extensions (MIME) is an industry email standard. You can now use a `$value` segment to get the MIME content of an Outlook message."
author: "JeremyKelley"
localization_priority: Priority
ms.prod: "sharepoint"
---

# Share files and folders in OneDrive and SharePoint

Apps can set permissions to share files and folders in OneDrive Personal, OneDrive for Business, and SharePoint with other users. Such sharing permissions on [driveItem](/graph/api/resources/driveitem) resources can be expressed as different facets:
- A permission with a _link_ facet is characterized by a [sharingLink](/graph/api/resources/sharinglink) for the item. Sharing links contain a unique token that provides access to the item for anyone with the link.
- A permission with an _invitation_ facet is characterized by a [sharingInvitation](/graph/api/resources/sharinginvitation) for the item. Such permissions share access to the item with specific users or groups, and optionally sends an email to notify them of the sharing.

## Sharing items using a link facet

Sharing links make it easy to share files. 

(A) Create link for anonymous (anyone with link), or organization scope.
- Expiration (https://docs.microsoft.com/en-us/graph/api/driveitem-createlink?view=graph-rest-beta&tabs=http#remarks)
Links created this way do not expire unless a default expiration policy is enforced for the organization.

sharingLink properties:
type (view/edit/embed) allows read or read-write access to the shared item, or embedding a link with read-only  access in a hosted webpage (in OneDrive for consumers only).
scope defines the extent of who can use the link to access per the link type; anonymous, organization, existingAccess (anyone already granted access, can be by sharing link or invitation, ODB/SP), users (specific users in ODB/SP).
webUrl specifies the actual sharing URL to access the shared driveItem
application specifies the app that the link is associated with.

Can share with anyone who has the link (scope is anonymous or organization). 
Show examples of "view link", "edit link"
Example of "Create company sharable link" (https://docs.microsoft.com/en-us/graph/api/driveitem-createlink?view=graph-rest-beta&tabs=http#creating-company-sharable-links)
Example of "Create embeddable link" (OD)
(https://docs.microsoft.com/en-us/graph/api/driveitem-createlink?view=graph-rest-beta&tabs=http#creating-embeddable-links)

(B) Alternatively can share item with specific users who must sign in to access the files (scope is users). Use grant access to sharing link to do that.
Show an example of "specific people link" (https://docs.microsoft.com/en-us/graph/api/resources/permission?view=graph-rest-beta#specific-people-link).

Note that if the scope of a sharingLink is "existingAccess", this means the link supports people who have already been granted access to the item through other means. When granting specific recipients access via a link of existingAccess scope, method can return additional permissions:
(After this link: https://docs.microsoft.com/en-us/graph/api/permission-grant?view=graph-rest-beta&tabs=http#response-1)
"User-type permissions representing recipients who were successfully granted access. These can be identified by presence of the grantedTo property.
Link-type permissions representing invitations that need to be sent to unrecognized external users for them to gain access. These can be identified by the presence of an invitation facet. These entries will contain a link with the invitation URL, and the grantedToIdentities collection will indicate the users to whom the link should be sent."



### API that supports this approach:
- Use "create sharing link" (driveitem-createlink.md) to create a link with scope "anonymous" or "organization".
- After creating a sharingLink, can use GET (permission-get.md) to get sharedId of permission which is a unique token that provides access to the item for anyone with the link.
Guess is based on remark in permission-get.md (https://docs.microsoft.com/en-us/graph/api/permission-get?view=graph-rest-beta&tabs=http#remarks):
"Sharing links contain a unique token that provides access to the item for anyone with the link."
- Use "use sharing link" (shares-get.md) to use the link to access the shared driveItem.
- Can use a sharing link with the scope "anonymous" or "organization", use "grant access to sharing link" (permission-grant.md) to specify recipients, and get an updated sharingLink with scope "users", and may have a different webUrl than the original, in which case the new URL should be used.
- Can revoke the grant on a sharing link.


## Sharing items using an invitation facet

Permissions with an invitation facet represent permissions added by inviting specific users or groups to have access to the file.

Specifies recipients property in the request payload. Set sendInvitation property.
Set expirationDateTime for the permission.

Show example in driveitem-invite.md
(https://docs.microsoft.com/en-us/graph/api/driveitem-invite?view=graph-rest-beta&tabs=http#example)

Note that (https://docs.microsoft.com/en-us/graph/api/resources/permission?view=graph-rest-beta#sharing-invitations):
The recipients property may contain email adresses that don't match a known account. In such cases, OneDrive / SP does not set the grantedTo property until the invitation link is redeemed, which occurs the first time the user clicks the link and signs in.

### API that supports this approach: 
driveitem-invite.md

## Next steps

Find out more about:

- [Why integrate with OneDrive file storage](onedrive-concept-overview.md)
- [Why integrate with SharePoint sites and lists](sharepoint-concept-overview.md)
- [OneDrive files API overview](/graph/api/resources/onedrive)
- [SharePoint sites and lists API overview](/graph/api/resources/sharepoint)