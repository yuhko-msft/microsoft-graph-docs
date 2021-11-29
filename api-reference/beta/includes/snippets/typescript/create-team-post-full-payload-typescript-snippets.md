---
description: "Automatically generated file. DO NOT MODIFY"
---

```typescript

//THIS SNIPPET IS A PREVIEW FOR THE KIOTA BASED SDK. NON-PRODUCTION USE ONLY
const graphServiceClient = new GraphServiceClient(requestAdapter);

const requestBody = new Team()
requestBody.visibility = "Private";
requestBody.displayName = "Sample Engineering Team";
requestBody.description = "This is a sample engineering team, used to showcase the range of properties supported by this API";
requestBody.channels = [
			new Channel();
requestBody.channels.additionalData = new Map([
					["displayName", "Announcements 📢"];
					["isFavoriteByDefault", true];
					["description", "This is a sample announcements channel that is favorited by default. Use this channel to make important team, product, and service announcements."];
				]);
			new Channel();
requestBody.channels.additionalData = new Map([
					["displayName", "Training 🏋️"];
					["isFavoriteByDefault", true];
					["description", "This is a sample training channel, that is favorited by default, and contains an example of pinned website and YouTube tabs."];
					["tabs", [
								 ["teamsApp@odata.bind" , "https://graph.microsoft.com/v1.0/appCatalogs/teamsApps('com.microsoft.teamspace.tab.web')"],
								 ["displayName" , "A Pinned Website"],
									 ["contentUrl" , "https://docs.microsoft.com/microsoftteams/microsoft-teams"],
								 ["teamsApp@odata.bind" , "https://graph.microsoft.com/v1.0/appCatalogs/teamsApps('com.microsoft.teamspace.tab.youtube')"],
								 ["displayName" , "A Pinned YouTube Video"],
									 ["contentUrl" , "https://tabs.teams.microsoft.com/Youtube/Home/YoutubeTab?videoId=X8krAMdGvCQ"],
									 ["websiteUrl" , "https://www.youtube.com/watch?v=X8krAMdGvCQ"],
						]
					],
				]);
			new Channel();
requestBody.channels.additionalData = new Map([
					["displayName", "Planning 📅 "];
					["description", "This is a sample of a channel that is not favorited by default, these channels will appear in the more channels overflow menu."];
					["isFavoriteByDefault", false];
				]);
			new Channel();
requestBody.channels.additionalData = new Map([
					["displayName", "Issues and Feedback 🐞"];
					["description", "This is a sample of a channel that is not favorited by default, these channels will appear in the more channels overflow menu."];
				]);
		]
	],
requestBody.memberSettings = new TeamMemberSettings();
requestBody.memberSettings.allowCreateUpdateChannels = true;
requestBody.memberSettings.allowDeleteChannels = true;
requestBody.memberSettings.allowAddRemoveApps = true;
requestBody.memberSettings.allowCreateUpdateRemoveTabs = true;
requestBody.memberSettings.allowCreateUpdateRemoveConnectors = true;
requestBody.guestSettings = new TeamGuestSettings();
requestBody.guestSettings.allowCreateUpdateChannels = false;
requestBody.guestSettings.allowDeleteChannels = false;
requestBody.funSettings = new TeamFunSettings();
requestBody.funSettings.allowGiphy = true;
requestBody.funSettings.giphyContentRating = "Moderate";
requestBody.funSettings.allowStickersAndMemes = true;
requestBody.funSettings.allowCustomMemes = true;
requestBody.messagingSettings = new TeamMessagingSettings();
requestBody.messagingSettings.allowUserEditMessages = true;
requestBody.messagingSettings.allowUserDeleteMessages = true;
requestBody.messagingSettings.allowOwnerDeleteMessages = true;
requestBody.messagingSettings.allowTeamMentions = true;
requestBody.messagingSettings.allowChannelMentions = true;
requestBody.discoverySettings = new TeamDiscoverySettings();
requestBody.discoverySettings.showInTeamsSearchAndSuggestions = true;
requestBody.installedApps = [
			new TeamsAppInstallation();
requestBody.installedApps.additionalData = new Map([
					["teamsApp@odata.bind", "https://graph.microsoft.com/v1.0/appCatalogs/teamsApps('com.microsoft.teamspace.tab.vsts')"];
				]);
			new TeamsAppInstallation();
requestBody.installedApps.additionalData = new Map([
					["teamsApp@odata.bind", "https://graph.microsoft.com/v1.0/appCatalogs/teamsApps('1542629c-01b3-4a6d-8f76-1938b779e48d')"];
				]);
		]
	],
requestBody.additionalData = new Map([
		["template@odata.bind", "https://graph.microsoft.com/beta/teamsTemplates('standard')"];
	]);
const result = async () => {
	await graphServiceClient.teams.post(requestBody);
}


```